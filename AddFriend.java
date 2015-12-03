package com.bignerdranch.android.shootit;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;

public class AddFriend extends FragmentActivity {

    protected Fragment createFragment() {
        return new AddFriendFragment();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    public static Intent newIntent(Context packageContext) {
        Intent i = new Intent(packageContext, AddFriend.class);
        return i;
    }
}

