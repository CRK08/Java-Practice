class Prime_Nos{
    public static void main(String[] args) {
        //Print Prime Number btw 1 to 1000
        int flag;
        for (int num =1;num<1000;num++){
            flag=0;
            for( int i =2; i<num;i++){
                    if(num%i==0){
                        flag = 1;
                        break;
                    }
                }
                
                if(flag==0){
                    System.out.println(num+",");
                
            }
        }
    }
}