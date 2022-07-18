
    /**
     * HashIntSet
     */

    public class HashIntSet
    {
        private static final double MAX_LOAD_FACTOR = 0.75;
        private HashEntry elementData[];
        private int size;

        public HashIntSet()
        {
            elementData = new HashEntry[10];
            for (int i=0; i<elementData.length; i++)
                elementData[i] = new HashEntry();
            size = 0;
        }
        public HashIntSet(int[] a){
            elementData = new HashEntry[10];
            for (int i=0; i<elementData.length; i++) {
                elementData[i] = new HashEntry();
            }
            size = 0;

            for(int i = 0; i<a.length;i++)
            {
                add(a[i]);
            }
        }

        // Hash Function
        private int hashFunction(int value)
        {
            return Math.abs(value) % elementData.length;
        }

        // Returns true if the given value is found in this set.
        public boolean contains(int value)
        {
            int bucket = hashFunction(value);
            HashEntry current = elementData[bucket];

            while (current != null) {
                if (current.data == value) {
                    return true;
                }
                current = current.next;
            }
            return false;
        }

        // Give the loadFactor
        private double loadFactor()
        {
            return (double) size / elementData.length;
        }

        // Adds the given element to this set, if it was not
        // already contained in the set.
        public void add(int value)
        {
            if (!contains(value))
            {
                if (loadFactor() >= MAX_LOAD_FACTOR) {
                    rehash();
                }

                // insert new value at front of list
                int bucket = hashFunction(value);
                elementData[bucket] = new HashEntry(value, elementData[bucket]);
                size++;

            }
        }

        // Resize the entire array and rehash it
        private void rehash()
        {
            // replace element data array with a larger empty version
            HashEntry[] oldElementData = elementData;

            elementData = new HashEntry[2 * oldElementData.length];
            size = 0;

            // re-add all of the old data into the new array
            for (int i = 0; i < oldElementData.length; i++)
            {
                HashEntry current = oldElementData[i];


                while (current != null)
                {
                    add(current.data);
                    current = current.next;

                }
            }
        }


        // Removes the given value if it is contained in the set.
        public void remove(int value)
        {
            int bucket = hashFunction(value);
            if (elementData[bucket] != null)
            {

                // check front of list

                if (elementData[bucket].data == value) {
                    elementData[bucket] = elementData[bucket].next;
                    size--;
                } else {
                    // check rest of list
                    HashEntry current = elementData[bucket];
                    while (current.next != null && current.next.data != value)
                    {
                        current = current.next;
                    }


                    // if the element is found, remove it
                    if (current.next != null)
                    {
                        current.next = current.next.next;
                        size--;
                    }
                }
            }
        }

        public String toString(){
            String s = "[";
            for(int i = 0;i<elementData.length;i++){
                HashEntry entry = elementData[i];

                while(entry !=null && entry.data !=0){
                    s += ", " + entry.data;
                    entry = entry.next;
                }

            }
            return s +"]";
        }

        public void addAll(HashIntSet hashSet){
            for(int i = 0;i<hashSet.elementData.length;i++)
            {
                HashEntry current = hashSet.elementData[i];

                while(current != null)
                {
                    if(!this.contains(current.data)){
                        this.add(current.data);
                    }
                    current = current.next;
                }
            }

        }

        public boolean containAll(HashIntSet s) {
            for(int i = 0;i<s.elementData.length;i++)
            {
                HashEntry node = s.elementData[i];
                while(node!=null)
                {
                    if(!this.contains(node.data)){
                        return false;
                    }
                    node = node.next;
                }
            }
            return true;
        }

        public void removeAll(HashIntSet s)
        {
            for(int i = 0;i<s.elementData.length;i++)
            {
                HashEntry node = s.elementData[i];

                while(node != null)
                {
                    if(this.contains(node.data))
                    {
                        this.remove(node.data);
                    }
                    node = node.next;
                }
            }

        }

        public void retailAll(HashIntSet s)
        {
            for(int i = 0;i<elementData.length;i++)
            {
                HashEntry node = elementData[i];

                while(node != null)
                {
                    if(!s.contains(node.data))
                    {
                        this.remove(node.data);
                    }
                    node = node.next;
                }
            }
        }

        public Object[] toArray()
        {
            Object[] array = new Object[this.size];
            int index = 0;
            for(int i = 0;i<elementData.length;i++)
            {
               HashEntry node = elementData[i];
               while(node != null)
               {
                   array[index] = node.data;
                   index++;
                   node = node.next;
               }
            }
            return array;
        }

        public boolean equals(HashIntSet s)
        {
            if(this.size != s.size) {return false;}

            for(int i = 0;i<elementData.length;i++)
            {
                HashEntry node = this.elementData[i];
                while(node != null)
                {
                    if(!s.contains(node.data))
                    {
                        return false;
                    }
                    node = node.next;
                }
            }
            return true;
        }
                // ====== HashEntry Inner Class =======
        public class HashEntry
        {
            private int data;
            private HashEntry next;

            public HashEntry()
            {
                this(0,null);
            }
            public HashEntry(int data)
            {
                this(data,null);
            }
            public HashEntry(int data,HashEntry next)
            {
                this.data = data;
                this.next = next;
            }

        }  // HashEntry



    } // HashIntSet



