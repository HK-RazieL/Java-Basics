package JavaBasics;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          Integer peopleToTransport = scanner.nextInt();
          Integer elevatorCapacity = scanner.nextInt();
          Integer numberOfTrips = peopleToTransport / elevatorCapacity;

          Integer result= (((int)Math.ceil((double)(peopleToTransport % elevatorCapacity)) > 0)
                  ? numberOfTrips + 1
                  : numberOfTrips);

          System.out.print(result);

    }
}
