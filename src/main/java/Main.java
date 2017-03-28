import dao.AdressbookDao;
import entity.Adressbook;

public class Main {
    public static AdressbookDao adressbookDao = new AdressbookDao();

    public static void main(String[] args) {
       /* insertTest();*/
     /*   updateTest();*/
        deleteTest();
        /*AdressbookDao addressbookDAO = new AdressbookDao();
        Adressbook addressbook = addressbookDAO.selectById(1);
        System.out.println("---------- selectById : 1");
        System.out.println(addressbook.toString());

        String name = "Ömer1";
        System.out.println("---------- selectByName : " + name);
        List<Adressbook> addressbookList = addressbookDAO.selectByName(name);

        if(addressbookList != null && addressbookList.size() > 0) {
            for (Adressbook adrsbook : addressbookList) {
                System.out.println(adrsbook.toString());
            }
        }else{
            System.out.println("---------- No record for : " + name);
        }*/

    }


  /*  public static void insertTest(){
        Adressbook user = new Adressbook();
        user.setId(2);
        user.setName("Ahmet1");
        user.setSurname("Dogu1");
        user.setAddress("Ahmets address1");
        user.setAge(25);
        user.setCellPhone(new Long("5559998877"));

        boolean isInserted = adressbookDao.insert(user);

        if(isInserted)
            System.out.println(user.getName() + " " + user.getSurname() + " is inserted");
        else
            System.out.println(user.getName() + " " + user.getSurname() + " is not inserted");
    }*/
   /* public static void updateTest(){
        AdressbookDao addressbookDAO = new AdressbookDao();
        Adressbook user2 = addressbookDAO.selectById(1);
        System.out.println("---------- selectById : 1");
        System.out.println(user2.toString());

        user2.setId(1);
        user2.setName("Ahmet2");
        user2.setSurname("Dogu2");
        user2.setAddress("Ahmets address2");
        user2.setAge(23);
        user2.setCellPhone(new Long("5419998877"));

        boolean isUpdated = adressbookDao.update(user2);

        if(isUpdated)
            System.out.println(user2.getName() + " " + user2.getSurname() + " is updated");
        else
            System.out.println(user2.getName() + " " + user2.getSurname() + " is not updated");
    }
*/
    public static void deleteTest() {
        AdressbookDao addressbookDAO = new AdressbookDao();
        Adressbook user2 = addressbookDAO.selectById(1);
        System.out.println("---------- selectById : 1");
        System.out.println(user2.toString());

        boolean isDeleted = adressbookDao.deleteById(user2);
        if(isDeleted)
            System.out.println(user2.getName() + " " + user2.getSurname() + " is deleted");
        else
            System.out.println(user2.getName() + " " + user2.getSurname() + " is not deleted");

    }



}

