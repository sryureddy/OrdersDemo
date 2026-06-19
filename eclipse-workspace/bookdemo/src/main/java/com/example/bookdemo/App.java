package com.example.bookdemo;



import java.util.List;

import java.util.Scanner;





public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BookDAO dao = new BookDAO();

        while (true) {

            System.out.println("\n===== Books MENU =====");

            System.out.println("1. Insert Book");

            System.out.println("2. Find Book By ID");

            System.out.println("3. Display All Books");

            System.out.println("4. Update Book");

            System.out.println("5. Delete Book");

            System.out.println("6. Exit");

            int choice = sc.nextInt();

            switch (choice) {

            case 1:

            	Book b = new Book();

                System.out.print("Enter ID: ");

                b.setId(sc.nextInt());

                sc.nextLine();

                System.out.print("Enter Title: ");

                b.setTitle(sc.nextLine());

                System.out.print("Enter Author: ");

                b.setAuthor(sc.nextLine());

                System.out.print("Enter Category: ");

                b.setCategory(sc.nextLine());

                System.out.print("Enter Price ");

                b.setPrice(sc.nextInt());

                System.out.print("Enter Availability ");

                b.setAvailable(sc.nextInt());

                dao.save(b);

                System.out.println("Book Saved");

                break;

            case 2:

                System.out.print("Enter ID: ");

                int id = sc.nextInt();

                Book book = dao.findById(id);

                if (book != null) {

                    System.out.println(book.getId());

                    System.out.println(book.getTitle());

                    System.out.println(book.getAuthor());

                    System.out.println(book.getCategory());

                    System.out.println(book.getPrice());

                    System.out.println(book.getAvailable());

                } else {

                    System.out.println("Book Not Found");

                }

                break;

            case 3:

                List<Book> books = dao.findAll();

                for (Book bk : books) {

                    System.out.println(

                    		bk.getId() + " "

                            + bk.getTitle() + " "

                            + bk.getAuthor() + " "

                            + bk.getCategory()  + " "

                            + bk.getPrice() + " "

                            + bk.getAvailable());

                }

                break;

            case 4:

                System.out.print("Enter Book ID: ");

                int updateId = sc.nextInt();

                Book up = dao.findById(updateId);

                if (up != null) {

                    sc.nextLine();

                    System.out.print("New Title: ");

                    up.setTitle(sc.nextLine());

                    System.out.print("New Author: ");

                    up.setAuthor(sc.nextLine());

                    System.out.print("New Category: ");

                    up.setCategory(sc.nextLine());

                    System.out.print("New Price: ");

                    up.setPrice(sc.nextInt());

                    System.out.print("New Available: ");

                    up.setAvailable(sc.nextInt());

                    dao.update(up);

                    System.out.println("Updated");

                }

                break;

            case 5:

                System.out.print("Enter Book ID: ");

                int deleteId = sc.nextInt();

                dao.delete(deleteId);

                System.out.println("Deleted");

                break;

            case 6:

                System.out.println("Thank You");

                sc.close();

                System.exit(0);

            }

        }

    }

}