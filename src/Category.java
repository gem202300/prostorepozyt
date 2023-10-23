public class Category {//
    private String name;
    public  Category (){
        this.name ="Default Category";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name!=null && !name.isEmpty()){
            this.name=name;
        }else{
            System.out.println("Invalid name!");
        }

    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                '}';
    }
}
