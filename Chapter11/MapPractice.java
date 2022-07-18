import java.util.*;
public class MapPractice
{
    public static void main()
    {
        List<String> list12 = new ArrayList<String>();
        list12.add("Apple");
        list12.add("A");
        list12.add("Apple");
        list12.add("Apple");
        list12.add("Apple");
        list12.add("bnb");
        System.out.println("list12:"+list12);
        System.out.println("contain3(list12):"+contain3(list12)+"\n");

        Map<String,String> map13 = new HashMap<String,String>();
        map13.put("Hugo","Tan");
        map13.put("Yongye","H");
        System.out.println("map13:"+map13);
        System.out.println("isUnique(map13):"+isUnique(map13)+"\n");
        
        Map<String, Integer> map14first = new HashMap<String, Integer>();
        Map<String, Integer> map14second = new HashMap<String, Integer>();
        map14first.put("Computer",1);
        map14first.put("Science",2);
        map14first.put("MAth",3);
        map14second.put("Computer",1);
        map14second.put("MAth",3);
        Map<String, Integer> map14 = intersect(map14first,map14second);
        System.out.println("map14first:"+map14first);
        System.out.println("map14second:"+map14second);
        System.out.println("Intersection map:"+map14+"\n");
        
        List<Integer> list15 = new ArrayList<Integer>();
        list15.add(10);
        list15.add(10);
        list15.add(10);
        list15.add(11);
        list15.add(11);
        list15.add(11);
        list15.add(11);
        list15.add(13);
        System.out.println("list15:"+list15);
        System.out.println("MaxOccur(list15):"+maxOccurence(list15)+"\n");
        
        Map<String,String> map17small = new HashMap<String,String>();
        Map<String,String> map17big = new HashMap<String,String>();
        map17small.put("Apple","Pie");
        map17small.put("Computer","Pie");
        map17small.put("Ice","Cream");
        map17small.put("Chocolate","cake");
        map17big.put("Apple","Pie");
        map17big.put("Ice","Cream");
        map17big.put("Malden","High");
        System.out.println("map17small:"+map17small);
        System.out.println("map17big:"+map17big);
        System.out.println("submap(map17small.map17big):"+subMap(map17small,map17big)+"\n");
        
        Map<String,Set<String>> map18 = reverse(map17small);
        System.out.println(map18);
        
        HashMap<String,Integer> m19 = new HashMap();
        m19.put("abc",4);
        m19.put("mew",4);
        m19.put("rty",9);
        m19.put("bbq",9);
        m19.put("fsd",5);
        System.out.println(m19);
        System.out.println("rarest:"+rarest(m19));
    }
    public static boolean contain3(List<String> list)
    {
        Map<String,Integer> map = new HashMap<String,Integer>();
        Iterator<String> itr = list.iterator();

        while(itr.hasNext())
        {
            String word = itr.next();
            if(map.containsKey(word))
            {
                map.put(word,map.get(word)+1);
            }else
            {
                map.put(word,1);
            }
        }
        for(String word : map.keySet())
        {
            int count = map.get(word);
            if(count>=3)
            {
                return true;
            }
        }
        return false;
    }

    public static boolean isUnique(Map<String, String> m)
    {
        return new HashSet<String>(m.values()).size() < m.size();
    }
    public static int maxOccurence(List<Integer> li)
    {
        if(li.isEmpty()){
            return 0;
        }
        Map<Integer,Integer> m = new HashMap<Integer,Integer>();        
        Iterator<Integer> itr = li.iterator();
        while(itr.hasNext())
        {
            int num = itr.next();
            if(!m.containsKey(num))
            {
                m.put(num,1);
            }else
            {
                m.put(num,m.get(num)+1);
            }
        }
        int most = 1;
        for(int key : m.keySet())
        {
            if(m.get(key)>most){
                most = m.get(key);
            }
        }
        return most;
    }
    public static boolean subMap(Map<String,String>m1, Map<String,String>m2)
    {
        for(String word : m1.keySet())
        {
            String value = m1.get(word);
            if(!m2.containsKey(word)&&!m2.containsValue(value))
            {
                return false;
            }
        }
        return true;
    }
    public static Map<String,Set<String>> reverse(Map<String,String> m)
    {
        Map<String,Set<String>> reverse = new HashMap<String,Set<String>>();
        for(String word : m.keySet())
        {
            Set<String> set = new HashSet<String>();
            for(String match : m.keySet()){
                if(m.get(word).equals(m.get(match)))
                {
                    set.add(match);
                }                
            }
            reverse.put(m.get(word),set);
        }
        return reverse;
    }
    public static Map<String, Integer> intersect(Map<String, Integer> m1, Map<String, Integer> m2 )
    {
        Map<String, Integer> mix  = new HashMap<String, Integer>();
        for(String m1word : m1.keySet())
        {
            for(String m2word : m2.keySet())
            {
                if(m1word.equals(m2word)&&m1.get(m1word)==m2.get(m2word))
                {
                    mix.put(m1word,m1.get(m1word));
                }
            }
        }
        return mix;
    }
    public static int rarest(Map<String,Integer> m)
    {
        
        if(m.isEmpty()){throw new IllegalArgumentException("map is isEmpty");}
        HashMap<Integer,Integer> rare = new HashMap();
        for(String s : m.keySet())
        {
            if(rare.containsKey(m.get(s))){
               rare.put(m.get(s),rare.get(m.get(s))+1);
            }else
            {
                rare.put(m.get(s),1);
            }
        }
        System.out.println(rare);
        int rarest = Integer.MAX_VALUE;
        int count = Integer.MAX_VALUE;
        for(Integer key: rare.keySet())
        {
            if(rare.get(key)<count)
            {
                count = rare.get(key);
                rarest = key;
            }
        }
        return rarest;
    }
}
