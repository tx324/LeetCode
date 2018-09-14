public class Sort {

        public static void sort(String[] x){
            sort(x,0);
        }

        /** Return the smallest String in x. **/
       public static int findsmallest(String[] x,int start){
            int smallestIndex = start;
            for(int i =start; i< x.length; i+=1){
                int cmp = x[i].compareTo(x[smallestIndex]);
                if(cmp<0){
                    smallestIndex = i;
                }
           }
            return smallestIndex;
       }

       /** swap item a with b. **/
       public static void swap(String[] x, int a, int b){
            String temp = x[a];
            x[a] = x[b];
            x[b] = temp;
       }

       /** Sorts x starting at position start **/
       public static void sort(String[]x, int start){
           if(start == x.length){
               return;
           }
           int smallestIndex = findsmallest(x,start);
           swap(x,start,smallestIndex);
           sort(x,start+1);
       }

}
