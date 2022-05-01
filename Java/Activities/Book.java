
//Activity5

abstract class  Book{

    String title;
    public abstract void setTitle(String arg);
    public String getTitle()
    {
        return title;
    }


}

class MyBook extends Book{


    @Override
    public void setTitle(String arg) {
        super.title=arg;
    }

    public static void main(String[] args){
        MyBook bk=new MyBook();
        bk.setTitle("PeterPan");
        System.out.println(bk.getTitle());


    }
}