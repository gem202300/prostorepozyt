public class Main {
    public static void main(String[] args) {
        Category category = new Category();
        test(category);
        category.setName("");
        test(category);
        category.setName(null);
        test(category);
        category.setName("Ivan");
        test(category);
        System.out.println(); //

    }
    public static void test(Category category ){
        System.out.println(category.getName());
        System.out.println(category);
        category.toString();
        System.out.println();
    }
}
