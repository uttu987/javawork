import java.io.IOException;

class M{
    void method() throws IOException{
        throw new IOException("device error ");
    }
}
class Test_Throws{
    public static void main(String[] args) throws IOException {
        M m=new M();
        m.method();
        System.out.println("normal flow...");
    }
}