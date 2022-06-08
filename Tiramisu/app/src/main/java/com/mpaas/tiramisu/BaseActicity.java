package com.mpaas.tiramisu;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;

/**
 * @author ctt
 * @description:
 * @date :2022/6/2 3:39 下午
 */
public class BaseActicity extends FragmentActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println(this.getClass());
        System.out.println(this.getClass().getSimpleName());
        System.out.println(this.getClass().getName());
        System.out.println(this.getClass().getSuperclass());
        System.out.println(this.getClass().getSuperclass().getSimpleName());
        System.out.println(this.getClass().getSuperclass().getName());
    }
}
