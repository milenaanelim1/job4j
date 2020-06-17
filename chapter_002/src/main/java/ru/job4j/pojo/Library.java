package ru.job4j.pojo;

public class Library {
    public static void main(String[]args){
        Book[] bookShelf = new Book[4];
        Book book1 = new Book("one", 37);
        Book book2 = new Book("Two", 245);
        Book book3 = new Book("Clean code",1);
        Book book4 = new Book("Four", 3422);

        bookShelf[0] = book1;
        bookShelf[1] = book2;
        bookShelf[2] = book3;
        bookShelf[3] = book4;

        for(int i = 0; i<bookShelf.length; i++){
            Book bk = bookShelf[i];
            System.out.println(bk.getName()+" - "+bk.getPages());
        }
        System.out.println("Replace [0] with [3]");
        Book tmp = bookShelf[3];
        bookShelf[3]=bookShelf[0];
        bookShelf[0]=tmp;
        for(int i = 0; i<bookShelf.length; i++){
            Book bk = bookShelf[i];
            System.out.println(bk.getName()+" - "+bk.getPages());
        }
        System.out.println("Shown 'Clean code'name only");
        for(int i = 0; i<bookShelf.length; i++){
            Book bk = bookShelf[i];
            if(bk.getName().equals("Clean code")){
                System.out.println(bk.getName()+" - "+bk.getPages());
            }
        }


    }
}

