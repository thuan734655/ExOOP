public class Test {
    public static void main(String[] args) {
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');
// Declare and allocate a Book instance
        Book javaDummy = new Book("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy);  // toString()

        System.out.println(javaDummy.getName()); //getName
        System.out.println(javaDummy.getAuthorName()); // getAuthorName
        System.out.println(javaDummy.getQty()); // get qty
        System.out.println(javaDummy.getPrice()); // get price
        javaDummy.setPrice(20);
        javaDummy.setQty(2);
        System.out.println(javaDummy);
            }
}



