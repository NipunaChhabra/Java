class ReplaceVowels
{ public static void main(String name)
    {
        name = name.replace('A', '*');
        name = name.replace('E', '*');
        name = name.replace('I', '*');
        name = name.replace('O', '*');
        name = name.replace('U', '*');
        System.out.println("name= " + name);
    }
}