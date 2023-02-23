package org.folio.bulkops.domain.converter;

import com.opencsv.bean.AbstractBeanField;
import com.opencsv.exceptions.CsvConstraintViolationException;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import org.apache.commons.lang3.ObjectUtils;
import org.folio.bulkops.service.HoldingsReferenceHelper;

import static org.apache.commons.lang3.StringUtils.EMPTY;

public class HoldingsLocationConverter extends AbstractBeanField<String, String> {

  @Override
  protected Object convert(String value) throws CsvDataTypeMismatchException, CsvConstraintViolationException {
    return HoldingsReferenceHelper.service().getLocationIdByName(value);
  }

  @Override
  protected String convertToWrite(Object value) {
    return ObjectUtils.isNotEmpty(value) ? HoldingsReferenceHelper.service().getLocationNameById(value.toString()) : EMPTY;
  }
}
