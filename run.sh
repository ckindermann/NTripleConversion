#!/bin/bash

mvn exec:java -e -Dexec.mainClass="uk.ac.man.cs.exp.TripleConverter" -Dexec.args="$1 $2" 
