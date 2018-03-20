package com.dvinfosys.circleimageview.EditTextView;


import android.support.annotation.NonNull;

import java.util.regex.Pattern;

public class RegexpCustomValidator extends CustomValidator {
    private Pattern pattern;

    public RegexpCustomValidator(@NonNull String errorMessage, @NonNull String regex) {
        super(errorMessage);
        pattern = Pattern.compile(regex);
    }

    public RegexpCustomValidator(@NonNull String errorMessage, @NonNull Pattern pattern) {
        super(errorMessage);
        this.pattern = pattern;
    }

    @Override
    public boolean isValid(@NonNull CharSequence text, boolean isEmpty) {
        return pattern.matcher(text).matches();
    }
}
