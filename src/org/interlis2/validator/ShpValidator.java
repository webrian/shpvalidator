package org.interlis2.validator;

import java.io.File;

import ch.interlis.iox_j.PipelinePool;

import ch.ehi.basics.settings.Settings;
import ch.interlis.ili2c.metamodel.TransferDescription;
import ch.interlis.iox.IoxException;
import ch.interlis.iox.IoxReader;
import ch.interlis.iox_j.logging.LogEventFactory;
import ch.interlis.ioxwkf.shp.ShapeReader;

/**
 *
 * @author webrian
 */
public class ShpValidator extends org.interlis2.validator.Validator {

    @Override
    protected IoxReader createReader(String filename, TransferDescription td, LogEventFactory errFactory,
            Settings settings, PipelinePool pool) throws IoxException {
        ShapeReader reader = new ShapeReader(new File(filename), settings);
        reader.setModel(td);
        return reader;
    }

}
