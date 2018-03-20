# CircleImageView And MaterialEdittext

CircleImageView For Android Studio

  <code><com.dvinfosys.circleimageview.ImageView.CircleImageView
                android:layout_width="200dp"
                android:src="@mipmap/ic_launcher"
                android:background="#b6b6b6"
                android:layout_height="200dp" />
	</code>
	
	
	Material EditText
	
	<code>
	<com.dvinfosys.circleimageview.EditTextView.MaterialEditText
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:hint="Library Name"
                android:text="MaterialEditText"
                android:textCursorDrawable="@drawable/text_cursor_cyan"
                android:textSize="34sp"
                app:met_baseColor="@android:color/white"
                app:met_floatingLabel="highlight"
                app:met_maxCharacters="20"
                app:met_primaryColor="?colorAccent"
                app:met_singleLineEllipsis="true" />

            <com.dvinfosys.circleimageview.EditTextView.MaterialEditText
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:hint="Description"
                android:text="EditText in Material Design"
                android:textCursorDrawable="@drawable/text_cursor_cyan"
                app:met_baseColor="@android:color/white"
                app:met_floatingLabel="highlight"
                app:met_maxCharacters="20"
                app:met_primaryColor="?colorAccent" />

        </LinearLayout>

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="vertical"
            android:paddingBottom="@dimen/activity_vertical_margin"
            android:paddingLeft="@dimen/activity_horizontal_margin"
            android:paddingRight="@dimen/activity_horizontal_margin"
            android:paddingTop="@dimen/activity_vertical_margin">

            <TextView
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text="Basic:"
                android:textColor="#333333"
                android:textSize="14sp" />

            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:gravity="center_vertical">

                <com.dvinfosys.circleimageview.EditTextView.MaterialEditText
                    android:id="@+id/basicEt"
                    android:layout_width="0dp"
                    android:layout_height="wrap_content"
                    android:layout_weight="1"
                    android:hint="Basic"
                    android:textColor="@color/text_color"/>

                <Button
                    android:id="@+id/enableBt"
                    android:layout_width="100dp"
                    android:layout_height="wrap_content"
                    android:layout_marginLeft="8dp"
                    android:text="DISABLE" />

            </LinearLayout>

            <TextView
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginTop="16dp"
                android:text="Floating Label:"
                android:textColor="#333333"
                android:textSize="14sp" />

            <TextView
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text="app:met_floatingLabel=&quot;normal&quot;"
                android:textColor="#888888"
                android:textSize="14sp" />

            <com.dvinfosys.circleimageview.EditTextView.MaterialEditText
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:hint="Floating Label"
                app:met_floatingLabel="normal" />

            <TextView
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginTop="16dp"
                android:text="Highlight Floating Label:"
                android:textColor="#333333"
                android:textSize="14sp" />

            <TextView
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text="app:met_floatingLabel=&quot;highlight&quot;"
                android:textColor="#888888"
                android:textSize="14sp" />

            <com.dvinfosys.circleimageview.EditTextView.MaterialEditText
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:hint="Highlight Floating Label"
                app:met_floatingLabel="highlight"/>

            <TextView
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginTop="16dp"
                android:text="Custom Floating Label Text:"
                android:textColor="#333333"
                android:textSize="14sp" />

            <TextView
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text="app:met_floatingLabel=&quot;normal&quot;\napp:met_floatingLabelText=&quot;Label&quot;"
                android:textColor="#888888"
                android:textSize="14sp" />

            <com.dvinfosys.circleimageview.EditTextView.MaterialEditText
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:hint="Custom Floating Label Text"
                app:met_floatingLabel="normal"
                app:met_floatingLabelText="Label" />

            <TextView
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginTop="16dp"
                android:text="Single Line Ellipsis:"
                android:textColor="#333333"
                android:textSize="14sp" />

            <TextView
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text="app:met_singleLineEllipsis=&quot;true&quot;\n#singLineEllipsis will force android:singleLine to true#"
                android:textColor="#888888"
                android:textSize="14sp" />

            <com.dvinfosys.circleimageview.EditTextView.MaterialEditText
                android:id="@+id/singleLineEllipsisEt"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:hint="Single Line Ellipsis"
                android:text="Touch The Ellipsis And See What Happens. Touch The Ellipsis And See What Happens."
                app:met_singleLineEllipsis="true" />

            <TextView
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginTop="16dp"
                android:text="Max/Min Characters:"
                android:textColor="#333333"
                android:textSize="14sp" />

            <TextView
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text="app:met_maxCharacters=&quot;5&quot;"
                android:textColor="#888888"
                android:textSize="14sp" />

            <com.dvinfosys.circleimageview.EditTextView.MaterialEditText
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:hint="Max Characters"
                app:met_maxCharacters="5" />

            <TextView
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text="app:met_minCharacters=&quot;3&quot;"
                android:textColor="#888888"
                android:textSize="14sp" />

            <com.dvinfosys.circleimageview.EditTextView.MaterialEditText
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:hint="Min Characters"
                app:met_minCharacters="3" />

            <TextView
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text="app:met_minCharacters=&quot;3&quot;\napp:met_maxCharacters=&quot;5&quot;"
                android:textColor="#888888"
                android:textSize="14sp" />

            <com.dvinfosys.circleimageview.EditTextView.MaterialEditText
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:hint="Min and Max"
                app:met_maxCharacters="5"
                app:met_minCharacters="3" />

            <TextView
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginTop="16dp"
                android:text="Helper/Error Text:"
                android:textColor="#333333"
                android:textSize="14sp" />

            <TextView
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text="app:met_helperText=&quot;helper is here&quot; (in xml)\nsetError(&quot;Error!&quot;) (in java)"
                android:textColor="#888888"
                android:textSize="14sp" />

            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:gravity="center_vertical">

                <com.dvinfosys.circleimageview.EditTextView.MaterialEditText
                    android:id="@+id/bottomTextEt"
                    android:layout_width="0dp"
                    android:layout_height="wrap_content"
                    android:layout_weight="1"
                    android:hint="Helper/Error Text"
                    app:met_helperText="helper is here" />

                <Button
                    android:id="@+id/setErrorBt"
                    android:layout_width="48dp"
                    android:layout_height="wrap_content"
                    android:layout_marginLeft="8dp"
                    android:text="1" />

                <Button
                    android:id="@+id/setError2Bt"
                    android:layout_width="48dp"
                    android:layout_height="wrap_content"
                    android:layout_marginLeft="8dp"
                    android:text="2" />

                <Button
                    android:id="@+id/setError3Bt"
                    android:layout_width="48dp"
                    android:layout_height="wrap_content"
                    android:layout_marginLeft="8dp"
                    android:text="3" />

            </LinearLayout>

            <TextView
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginTop="16dp"
                android:text="Validation:"
                android:textColor="#333333"
                android:textSize="14sp" />

            <TextView
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text="addValidator(new RegexValidator(&quot;Only Integer Valid!&quot;, &quot;\\\\d+&quot;)); (in java)"
                android:textColor="#888888"
                android:textSize="14sp" />

            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:gravity="center_vertical">

                <com.dvinfosys.circleimageview.EditTextView.MaterialEditText
                    android:id="@+id/validationEt"
                    android:layout_width="0dp"
                    android:layout_height="wrap_content"
                    android:layout_weight="1"
                    android:hint="Validation"
                    app:met_helperText="Integer" />

                <Button
                    android:id="@+id/validateBt"
                    android:layout_width="120dp"
                    android:layout_height="wrap_content"
                    android:layout_marginLeft="8dp"
                    android:text="VALIDATE" />

            </LinearLayout>

            <TextView
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginTop="16dp"
                android:text="Custom Colors:"
                android:textColor="#333333"
                android:textSize="14sp" />

            <TextView
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text="app:met_baseColor=&quot;#007688&quot;\napp:met_primaryColor=&quot;#2196F3&quot;\napp:met_textColor=&quot;@color/text_color&quot;\napp:met_textColorHint=&quot;#33ff0000&quot;\napp:met_errorColor=&quot;#ddaa00&quot;\napp:met_helperTextColor=&quot;#795548&quot;\napp:met_underlineColor=&quot;#003587&quot;\napp:met_floatingLabelTextColor=&quot;#8805ad&quot;"
                android:textColor="#888888"
                android:textSize="14sp" />

            <com.dvinfosys.circleimageview.EditTextView.MaterialEditText
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:hint="Custom Colors"
                app:met_floatingLabel="normal"
                app:met_helperText="Helper Text"
                app:met_maxCharacters="5"
                app:met_baseColor="#007688"
                app:met_primaryColor="#2196F3"
                app:met_textColor="@color/text_color"
                app:met_textColorHint="#33ff0000"
                app:met_errorColor="#ddaa00"
                app:met_helperTextColor="#795548"
                app:met_underlineColor="#003587"
                app:met_floatingLabelTextColor="#8805ad"/>

            <TextView
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginTop="16dp"
                android:text="Custom Typeface:"
                android:textColor="#333333"
                android:textSize="14sp" />

            <TextView
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text="app:met_typeface=&quot;fonts/Roboto-LightItalic.ttf&quot;\napp:met_accentTypeface=&quot;fonts/Roboto-LightItalic.ttf&quot;"
                android:textColor="#888888"
                android:textSize="14sp" />

            <com.dvinfosys.circleimageview.EditTextView.MaterialEditText
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:hint="Custom Accent Typeface"
                app:met_typeface="fonts/Roboto-LightItalic.ttf"
                app:met_accentTypeface="fonts/Roboto-LightItalic.ttf"
                app:met_floatingLabel="normal"
                app:met_helperText="Helper Text"
                app:met_maxCharacters="5" />

            <TextView
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginTop="16dp"
                android:text="Hide underline"
                android:textColor="#333333"
                android:textSize="14sp" />

            <TextView
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text="app:met_hideUnderline=&quot;true&quot;"
                android:textColor="#888888"
                android:textSize="14sp" />

            <com.dvinfosys.circleimageview.EditTextView.MaterialEditText
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:hint="Hidden underline"
                app:met_hideUnderline="true" />

            <TextView
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginTop="16dp"
                android:text="Clear Button"
                android:textColor="#333333"
                android:textSize="14sp" />

            <TextView
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text="app:met_clearButton=&quot;true&quot;"
                android:textColor="#888888"
                android:textSize="14sp" />

            <com.dvinfosys.circleimageview.EditTextView.MaterialEditText
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:hint="Clear Button"
                app:met_clearButton="true" />

            <TextView
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginTop="16dp"
                android:text="Material Design Icon"
                android:textColor="#333333"
                android:textSize="14sp" />

            <TextView
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text="app:met_iconLeft=&quot;@drawable/ic_phone&quot;\napp:met_iconPadding=&quot;0dp&quot; (Note: 16dp by default, not 0)"
                android:textColor="#888888"
                android:textSize="14sp" />

            <com.dvinfosys.circleimageview.EditTextView.MaterialEditText
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:hint="Material Design Icon"
                app:met_iconLeft="@drawable/ic_phone"
                app:met_iconPadding="10dp"
                app:met_maxCharacters="5" />
	</code>
	
