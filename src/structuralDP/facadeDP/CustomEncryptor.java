package structuralDP.facadeDP;

public class CustomEncryptor {
    public static void main(String[] args) {
        //
        String text = "Content";
        ///bad scenario
        AESEncryptor aesEncryptor = new AESEncryptor();
        aesEncryptor.encrypt(text);

        MD5Encryptor md5Encryptor = new MD5Encryptor();
        md5Encryptor.encrypt(text,"Security");

        SHAEncryptor shaEncryptor = new SHAEncryptor();
        shaEncryptor.encrypt(text, "security", false);

        System.out.println("================================");
        //good scenario

        FacadeEncryptor facadeEncryptor = new FacadeEncryptor();
        facadeEncryptor.encryptor(text, FacadeEncryptor.EncryptType.MD5);
        facadeEncryptor.encryptor(text, FacadeEncryptor.EncryptType.SHA);
        facadeEncryptor.encryptor(text, FacadeEncryptor.EncryptType.AES);
    }
}
