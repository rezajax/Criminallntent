package com.rezajax.criminalintent;

import android.app.Fragment;

/**
 * Created by JAX on 2/12/2018.
 */

public class CrimeListAcrivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeFragment();
    }

}

