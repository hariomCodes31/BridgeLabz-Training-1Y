class novo{
    public static void main(String[] args) {
        String s="hari om hari om";
        int count =0;
        for(int i =0;i<s.length();i++){
            char ch =s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        int min=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==' ')
            min++;
        }  
        int c=s.length()-count-min;
        System.out.println("vowel "+count);
        System.out.println("Consonant "+c);
    }
}