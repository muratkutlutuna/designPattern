package structuralDP.facadeDP;

public class FacadeEncryptor {

    private AESEncryptor aesEncryptor = new AESEncryptor();
    private MD5Encryptor md5Encryptor = new MD5Encryptor();
    private SHAEncryptor shaEncryptor = new SHAEncryptor();

    public void encryptor(String text,EncryptType encryptType){
        switch (encryptType) {
            case SHA:shaEncryptor.encrypt(text,"secretKey",true);
            break;
            case MD5:md5Encryptor.encrypt(text,"secretKey");
            break;
            case AES:aesEncryptor.encrypt(text);
            break;
            default:
                throw new IllegalArgumentException(encryptType.toString());
        }
    }

    public enum EncryptType{
        SHA,
        MD5,
        AES
    }


}
