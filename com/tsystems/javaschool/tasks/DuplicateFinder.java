package com.tsystems.javaschool.tasks;

import java.io.File;

/**
 * Created by max on 16.08.16.
 */
public interface DuplicateFinder  {
        /**
         * Processes the specified file and puts into another sorted and unique
         * lines each followed by number of occurrences.
         *
         * @param sourceFile
         *            file to be processed
         * @param targetFile
         *            output file; append if file exist, create if not.
         * @return <code>false</code> if there were any errors, otherwise
         *         <code>true</code>
         */
        boolean process(File sourceFile, File targetFile);
    }

