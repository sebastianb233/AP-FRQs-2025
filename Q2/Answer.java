public class SignedText{
    private String fristName;
    private String lastName;
    

    public SignedText(String Text1,String Text2){
        fristName=Text1;
        lastName=Text2;
    }

    public String getSignature(){
        if(fristName.equals("")){
            return lastName;
        }else{
            return fristName.substring(0,1)+" - "+lastName;
        }
    }

    public String addSignature(String text){
        if(getSignature().indexOf(text)==-1){
            return getSignature()+text;
        }
        int index=text.indexOf(getSignature);
        if(index== (text.length()-getSignature().length())){
            return text;
        }else if(index==0){
            return text.substring(getSignature())+getSignature();
        }
    }
}
