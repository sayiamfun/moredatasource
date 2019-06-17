package com.sayimfun.moredatasource.common.validatorgroup;

import com.sayimfun.moredatasource.common.validatorgroup.field.*;

import javax.validation.GroupSequence;

@GroupSequence({FieldTwo.class, FieldThree.class})
public interface LoginCheck {
}
