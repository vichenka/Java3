package book;
import edition.Edition;
//extends наследование
 public class Book extends Edition{
    private int UDK;
    public Publisher publisher;//обект внутр класса
    Type bookType;//объект енум

     public Book() {
         super();
     }

     public int getUDK()
    {
        return UDK;
    }
    public void setUDK(int UDK)
    {
        this.UDK = UDK;
    }

    public Book(String name, String author, int year, int number_of_pages, int cost, int UDK, String publ, Type type)
    {
        super(name, author, year, number_of_pages, cost);
        this.UDK = UDK;
        publisher = new Publisher(publ);
        bookType = type;
    }


    @Override
    public String toString() {
        return "Книга " + getName() + " автора " + getAuthor()
                + ", год издания  " + getYear() + ", количество страниц " + getNumber_of_pages() + ", стоимость: " + getCost() + ";УДК: " + getUDK() + " Издатель: " + publisher.name + " Тип книги: " + bookType;
    }
//вложенный класс - это класс, который объявлен внутри объявления другого класса.
    // нестатические вложенные классы имеют и другое название - внутренние классы
    class Publisher{//внутренний класс

        public String name;
        public Book book;

        public Publisher(String name){
            book=Book.this;
            this.name=name;
        }
    }
}
