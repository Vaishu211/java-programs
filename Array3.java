class Array3{
    public static void main(String[] args){
        int[] numbers= {3,4,7,2,6,5};
        int first=0;
        int second=0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>first) {
                second = first;
                first = numbers[i];
            } else if (numbers[i]>second)
            {
                second=numbers[i];
            }
           // System.out.println(" first maximum:"+first);
            //System.out.println("second maximum:"+second);
            }
        System.out.println(" first maximum:"+first);
        System.out.println("second maximum:"+second);
        }
    }
