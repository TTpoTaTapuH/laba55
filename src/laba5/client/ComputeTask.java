package laba5.client;

import laba5.compute.Compute;

import java.math.BigDecimal;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ComputeTask {
    public static void main(String args[]) {
        if (System.getSecurityManager() == null) {
            System.setSecurityManager(new SecurityManager());
        }
        try {
            String name = "Compute";
            Registry registry = LocateRegistry.getRegistry(args[0]);
            Compute comp = (Compute) registry.lookup(name);
            int[] arr = new int[args.length-1];
            for(int i=0; i<args.length-1; i++){
                arr[i] = Integer.parseInt(args[i+1]);
            }
            System.out.println("Запустился)))");
            Task1 task = new Task1(arr);
            String pi = comp.executeTask(task);
            System.out.println(pi);
        } catch (Exception e) {
            System.err.println("ComputePi exception:");
            e.printStackTrace();
        }
    }
}