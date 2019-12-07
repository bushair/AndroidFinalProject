
package com.example.androidfinalproject;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.example.payrollsystem.ui.addEmployee.AddEmployeeFragment;
import com.example.payrollsystem.ui.home.HomeFragment;
import com.example.payrollsystem.ui.listPayroll.ListPayrollFragment;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.view.MenuItem;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

    DrawerLayout drawer;
    NavigationView navigationView;
    Fragment[] fragments;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);

        setUpNavigationView();

        fragments = new Fragment[]{new HomeFragment(), new AddEmployeeFragment(), new ListPayrollFragment()};

        openFragment(0);
    }
