package edu.ntnu.idatt2001.mvc.animals.view;

import edu.ntnu.idatt2001.mvc.animals.controller.Simulator;

public class SimulatorApp {

  public static void main(String[] args) {

    Simulator simulator = new Simulator();
    simulator.runLongSimulation();
  }

}
