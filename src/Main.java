public class Main {
    public static void main(String[] args)
    {
        Student s = new Student("Savanah", 12, "Highschool");
        Student h = new Student("Quincy Holmer", 45);
        System.out.println(s.studentInfo());
        System.out.println(h.studentInfo());
        VowelCounter vc = new VowelCounter("how are you?");
        System.out.println(vc.getVowelCount());
        vc = new VowelCounter("i am calling you");
        System.out.println(vc.getVowelCount());
        vc = new VowelCounter("www yyy zzz");
        System.out.println(vc.getVowelCount());
        vc = new VowelCounter("aeiou");
        System.out.println(vc.getVowelCount());
        NumberStringGenerator NSG = new NumberStringGenerator(10);
        System.out.println(NSG.getBigNumCount() + " - " + NSG.getNumberString());
    }
}
