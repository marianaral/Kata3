/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata3;

/**
 *
 * @author marianaranjoalmeida
 */
public class Kata3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram<>();
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ull.es");
        histogram.increment("ull.es");
        histogram.increment("icloud.es");
        histogram.increment("icloud.es");
        histogram.increment("icloud.es");
        histogram.increment("gmail.es");
        
        
        HistogramDisplay histogramDisplay = new HistogramDisplay("Histogram", histogram);
        histogramDisplay.execute();
    }
    
}
