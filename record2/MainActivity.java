<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <TextView
        android:id="@+id/textView6"
        android:layout_width="142dp"
        android:layout_height="54dp"
        android:layout_marginStart="27dp"
        android:layout_marginTop="70dp"
        android:layout_marginEnd="16dp"
        android:layout_marginBottom="33dp"
        android:text="username"
        android:textAppearance="@style/TextAppearance.AppCompat.Large"
        app:layout_constraintBottom_toTopOf="@+id/textView8"
        app:layout_constraintEnd_toStartOf="@+id/editTextText6"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textView9" />

    <TextView
        android:id="@+id/textView8"
        android:layout_width="142dp"
        android:layout_height="52dp"
        android:layout_marginStart="27dp"
        android:layout_marginTop="33dp"
        android:layout_marginEnd="16dp"
        android:layout_marginBottom="640dp"
        android:text="password"
        android:textAppearance="@style/TextAppearance.AppCompat.Large"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toStartOf="@+id/editTextText7"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textView6" />

    <TextView
        android:id="@+id/textView9"
        android:layout_width="114dp"
        android:layout_height="54dp"
        android:layout_marginStart="125dp"
        android:layout_marginEnd="188dp"
        android:text="login"
        android:textAppearance="@style/TextAppearance.AppCompat.Large"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.055" />

    <EditText
        android:id="@+id/editTextText6"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="16dp"
        android:layout_marginTop="70dp"
        android:layout_marginEnd="32dp"
        android:layout_marginBottom="42dp"
        android:ems="10"
        android:hint="Enter the Username"
        android:inputType="text"
        app:layout_constraintBottom_toTopOf="@+id/editTextText7"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toEndOf="@+id/textView6"
        app:layout_constraintTop_toBottomOf="@+id/textView9" />

    <EditText
        android:id="@+id/editTextText7"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="16dp"
        android:layout_marginTop="42dp"
        android:layout_marginEnd="32dp"
        android:layout_marginBottom="170dp"
        android:ems="10"
        android:hint="password"
        android:inputType="text"
        app:layout_constraintBottom_toTopOf="@+id/button5"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toEndOf="@+id/textView8"
        app:layout_constraintTop_toBottomOf="@+id/editTextText6" />

    <Button
        android:id="@+id/button5"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Login"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.952"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.526" />

</androidx.constraintlayout.widget.ConstraintLayout>
