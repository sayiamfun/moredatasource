package com.sayimfun.moredatasource.common.validatorgroup;


import com.sayimfun.moredatasource.common.validatorgroup.field.*;

import javax.validation.GroupSequence;

@GroupSequence({FieldTwo.class, FieldThree.class, FieldFour.class, FieldFive.class, FieldSix.class})
public interface AddCheck {
}
