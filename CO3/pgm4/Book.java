class Book{

    public static void main(String args[]) {
       Literature l = new Literature("Lit","OF MICE AND MEN","PENGUIN BOOKS");
       Fiction F= new Fiction("Fic","THE GIRL IN ROOM 105","WESTLAND");
       l.display();
       F.display();
       
    }
}

class Publisher {
    String publisherName;
    Publisher(String P){
        this.publisherName = P;
    }
    void display(){
        System.out.println("Publisher Name : " + this.publisherName);
    }
}

class Books extends Publisher{  
    String bookName;
    Books(String B,String P){
        super(P);
        this.bookName =B;
    }
    void display(){
        super.display();
        System.out.println("Bookname Name : " + this.bookName);
    }
}

class Literature extends Books{  
    String LiteratureName;
    Literature(String L,String B,String P){
        super(B,P);
        this.LiteratureName = L;
    }
    void display(){
        System.out.println("__________________________________________");
        super.display();
        System.out.println("Literature Name : " + this.LiteratureName);
        System.out.println("__________________________________________");
    }
 
}

class Fiction extends Books{  
    String FictionName;
    Fiction(String F,String B,String P){
        super(B,P);
        this.FictionName = F;
    }
   void display(){
        System.out.println("___________________________________________");
        super.display();
        System.out.println("Fiction Name : " + this.FictionName);
        System.out.println("___________________________________________");
    }
}
