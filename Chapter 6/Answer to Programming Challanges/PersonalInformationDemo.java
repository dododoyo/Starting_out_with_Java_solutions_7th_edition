public class PersonalInformationDemo 
{
    public static void main(String[] args)
    {
        PersonalInformation Me = new PersonalInformation();
        PersonalInformation Feynman = new PersonalInformation();
        PersonalInformation Hardy = new PersonalInformation();
        Me.setName("Dolphin Mulugeta");
        Me.setAge(21);
        Me.setAddress("Addis Ababa");
        Me.setPhone(31243433);

        Feynman.setName("Richard Feynman");
        Feynman.setAge(56);
        Feynman.setAddress("America");
        Feynman.setPhone(38238020);

        Hardy.setName("Godfrey Harold Hardy");
        Hardy.setAge(70);
        Hardy.setAddress("England");
        Hardy.setPhone(9909088);

        System.out.println(Feynman.getName());
        System.out.println(Feynman.getAge());
        System.out.println(Feynman.getAddress());
        System.out.println(Feynman.getPhone());
        System.out.println();
        System.out.println(Me.getName());
        System.out.println(Me.getAge());
        System.out.println(Me.getAddress());
        System.out.println(Me.getPhone());
        System.out.println();
        System.out.println(Hardy.getName());
        System.out.println(Hardy.getAge());
        System.out.println(Hardy.getAddress());
        System.out.println(Hardy.getPhone());

    }
    
}
