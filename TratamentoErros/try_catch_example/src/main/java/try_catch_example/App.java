/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package try_catch_example;

public class App {
    public String getGreeting() {
        try {
            return "Hello World!!!";
        } catch (Exception e) {
            return "Erro: " + e.getLocalizedMessage();
        } catch (Exception2 e) {
            return "Erro: " + e.getLocalizedMessage();
        }
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}