package uk.ac.man.cs.exp;

import java.io.*;

import org.apache.jena.rdf.model.*;
import org.apache.jena.vocabulary.*;
import org.apache.jena.util.FileManager;


/**
 * Created by chris on 07/04/18.
 */

public class TripleConverter {

    public static void main(String[] args) throws IOException
    {
        String ontologyPath = args[0];
        String outputPath = args[1];

        // create an empty model
        Model m = ModelFactory.createDefaultModel();

        m.read(new FileInputStream (new File(ontologyPath)),"RDF/XML"); 
        m.write(new FileOutputStream (new File(outputPath)) , "N-TRIPLE"); 
    }
}
