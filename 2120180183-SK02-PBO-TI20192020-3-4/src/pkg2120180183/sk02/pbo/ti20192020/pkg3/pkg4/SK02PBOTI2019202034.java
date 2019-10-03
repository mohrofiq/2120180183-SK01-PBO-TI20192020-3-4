package pkg2120180183.sk02.pbo.ti20192020.pkg3.pkg4;
public class SK02PBOTI2019202034 {
    public static void main(String[] args) {
aplikasi WeChat = new aplikasi();
        WeChat.chat=150;        
        WeChat.videocall=20;        
        WeChat.telefon=30;        
        System.out.println(WeChat.nama);
        System.out.println("Chat anda sekarang "+WeChat.chat);
        System.out.println("Anda tidak menjawab "+WeChat.telefon);
        System.out.println("Video call dari teman anda "+WeChat.videocall);
        WeChat.mengirim_gambar();
        WeChat.mengirim_pesan();
        WeChat.group();
    }
}
