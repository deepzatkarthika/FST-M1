

interface Addable{
    public abstract int add(int num1,int num2);
}
public  class Activity12 {


    public static int main(String[] args){

        Addable ad1=(int num1, int num2)->{
            return num1+num2;
        };

        Addable ad2=(num1,num2)-> (num1+num2);
        System.out.println(ad2.add(10,20));
        System.out.println(ad1.add(30,20));

    }

}
