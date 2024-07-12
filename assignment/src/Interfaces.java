class phone{
    void call(){
        System.out.println("we can perform call operation");
    }
    void msg(){
        System.out.println("we can send messages");
    }
}
interface Camera{
    void click();
    void record();
    public  static void meth3(){
        System.out.println("this is meth 3");
    }
}
interface MusicPlayer extends Camera{
    void play();
    void pause();

}
class  SmartPhone extends phone implements Camera,MusicPlayer{
    public void call(){
        System.out.println("snartphone performing call operation");
    }
    public void msg(){
        System.out.println("smartphone sending the message");
    }
    public void vediocall(){
        System.out.println("smartphone performing vedio calling");

    }
    public void click(){
        System.out.println("smartphone can capture  pictures");
    }
    public void record(){
        System.out.println("Smartphone can record video");
    }
    public void play() {
        System.out.println("smartphone can play the music");
    }
    public void pause() {
        System.out.println("smartphone paused the playlist");
    }
}
public class Interfaces {
    public static void main(String[] args) {
        SmartPhone sp=new SmartPhone();
        //phone p=sp;
        Camera c=sp;
        MusicPlayer mp=sp;
        sp.vediocall();
        sp.call();
        //sp.msg();
        sp.play();
        //p.call();
        phone p=new phone();
        p.call();
        mp.pause();

    }
}
