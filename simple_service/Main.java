import java.io.File;
import java.util.Map;

public class Main {
  public static void main(String[] args) {
    System.out.println("This is an example of a simple template running on a remote Agent via Opereto orchestration framework.\n");
    System.out.println("<b>Opereto built-in parameters:</b>");
    Map<String, String> env = System.getenv();
        for (String envName : env.keySet()) {
            if (envName.startsWith("opereto_") || envName=="pid") {
                System.out.format("%s=%s%n",envName,env.get(envName));
            }
        }
        
    System.out.println("\n\n<b>Input properties:</b>\n");
    System.out.format("my_text=%s%n",env.get("my_text"));
    System.out.format("my_textarea=%s%n",env.get("my_textarea"));
    System.out.format("my_json=%s%n",env.get("my_json"));
    System.out.format("my_number=%s%n",env.get("my_number"));
    System.out.format("my_selectbox=%s%n",env.get("my_selectbox"));
    System.out.format("my_multi_selectbox=%s%n",env.get("my_multi_selectbox"));
    System.out.format("my_checkbox=%s%n",env.get("my_checkbox"));
   

    System.out.println("\n\n<b>Basic OS information:</b>\n");
    /* Total number of processors or cores available to the JVM */
    System.out.println("Available processors (cores): " + 
        Runtime.getRuntime().availableProcessors());

    /* Total amount of free memory available to the JVM */
    System.out.println("Free memory (bytes): " + 
        Runtime.getRuntime().freeMemory());

    /* This will return Long.MAX_VALUE if there is no preset limit */
    long maxMemory = Runtime.getRuntime().maxMemory();
    /* Maximum amount of memory the JVM will attempt to use */
    System.out.println("Maximum memory (bytes): " + 
        (maxMemory == Long.MAX_VALUE ? "no limit" : maxMemory));

    /* Total memory currently available to the JVM */
    System.out.println("Total memory available to JVM (bytes): " + 
        Runtime.getRuntime().totalMemory());

    /* Get a list of all filesystem roots on this system */
    File[] roots = File.listRoots();

    /* For each filesystem root, print some info */
    for (File root : roots) {
      System.out.println("File system root: " + root.getAbsolutePath());
      System.out.println("Total space (bytes): " + root.getTotalSpace());
      System.out.println("Free space (bytes): " + root.getFreeSpace());
      System.out.println("Usable space (bytes): " + root.getUsableSpace());
    }
  }
}
