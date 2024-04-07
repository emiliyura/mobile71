package com.example.mobile71;//package com.example.mobile71;
//
//import android.content.DialogInterface;
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//
//import androidx.appcompat.app.AlertDialog;
//import androidx.appcompat.app.AppCompatActivity;
//
//public class MainActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) { // Метод, вызываемый при создании активности
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main); // Устанавливает разметку для активности
//
//        Button alertDialogButton = findViewById(R.id.alert_dialog_button); // Находит кнопку по идентификатору
//        alertDialogButton.setOnClickListener(new View.OnClickListener() { // Устанавливает слушатель нажатий на кнопку
//            @Override
//            public void onClick(View v) {
//                showAlertDialog(); // Вызывает метод для отображения диалогового окна
//            }
//        });
//    }
//
//    private void showAlertDialog() { // Метод для отображения диалогового окна
//        AlertDialog.Builder builder = new AlertDialog.Builder(this); // Создает билдер диалогового окна
//        builder.setTitle("Alert Dialog"); // Устанавливает заголовок диалогового окна
//        builder.setMessage("Do you want to open another activity?"); // Устанавливает сообщение в диалоговом окне
//        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() { // Устанавливает положительную кнопку и ее обработчик
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                // Открываем другую активность
//                Intent intent = new Intent(MainActivity.this, AnotherActivity.class); // Создает интент для перехода на другую активность
//                startActivity(intent); // Запускает новую активность
//            }
//        });
//        builder.setNegativeButton("No", new DialogInterface.OnClickListener() { // Устанавливает отрицательную кнопку и ее обработчик
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                dialog.dismiss(); // Закрывает диалоговое окно
//            }
//        });
//        AlertDialog alertDialog = builder.create(); // Создает диалоговое окно из билдера
//        alertDialog.show(); // Отображает диалоговое окно
//    }
//}




//package com.example.mobile71;
//
//import android.annotation.SuppressLint;
//import android.app.DatePickerDialog;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.DatePicker;
//import android.widget.TextView;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import com.example.mobile71.R;
//
//import java.util.Calendar;
//
//public class MainActivity extends AppCompatActivity {
//    private TextView selectedDateTextView; // Текстовое поле для отображения выбранной даты
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) { // Метод, вызываемый при создании активности
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main); // Устанавливает разметку для активности
//
//        selectedDateTextView = findViewById(R.id.selected_date_text_view); // Находит текстовое поле по идентификатору
//
//        Button datePickerButton = findViewById(R.id.date_picker_button); // Находит кнопку по идентификатору
//        datePickerButton.setOnClickListener(new View.OnClickListener() { // Устанавливает слушатель нажатий на кнопку
//            @Override
//            public void onClick(View v) {
//                showDatePickerDialog(); // Вызывает метод для отображения диалогового окна выбора даты
//            }
//        });
//    }
//
//    private void showDatePickerDialog() { // Метод для отображения диалогового окна выбора даты
//        Calendar calendar = Calendar.getInstance(); // Получает текущий календарь
//        int year = calendar.get(Calendar.YEAR); // Получает текущий год
//        int month = calendar.get(Calendar.MONTH); // Получает текущий месяц (начиная с 0)
//        int day = calendar.get(Calendar.DAY_OF_MONTH); // Получает текущий день месяца
//
//        DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() { // Создает диалоговое окно выбора даты
//            @Override
//            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
//                @SuppressLint("DefaultLocale") String selectedDate = String.format("%02d/%02d/%04d", dayOfMonth, month + 1, year); // Форматирует выбранную дату
//                selectedDateTextView.setText(selectedDate); // Устанавливает выбранную дату в текстовое поле
//            }
//        }, year, month, day); // Устанавливает текущую дату в качестве начальной
//        datePickerDialog.show(); // Отображает диалоговое окно выбора даты
//    }
//}


//package com.example.mobile71;
//
//import android.annotation.SuppressLint;
//import android.app.TimePickerDialog;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.TimePicker;
//import android.widget.TextView;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import java.util.Calendar;
//
//public class MainActivity extends AppCompatActivity {
//
//    private TextView selectedTimeTextView; // Текстовое поле для отображения выбранного времени
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) { // Метод, вызываемый при создании активности
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main); // Устанавливает разметку для активности
//
//        selectedTimeTextView = findViewById(R.id.selected_time_text_view); // Находит текстовое поле по идентификатору
//
//        Button timePickerButton = findViewById(R.id.time_picker_button); // Находит кнопку по идентификатору
//        timePickerButton.setOnClickListener(new View.OnClickListener() { // Устанавливает слушатель нажатий на кнопку
//            @Override
//            public void onClick(View v) {
//                showTimePickerDialog(); // Вызывает метод для отображения диалогового окна выбора времени
//            }
//        });
//    }
//
//    private void showTimePickerDialog() { // Метод для отображения диалогового окна выбора времени
//        Calendar calendar = Calendar.getInstance(); // Получает текущий календарь
//        int hour = calendar.get(Calendar.HOUR_OF_DAY); // Получает текущий час (в формате 24 часов)
//        int minute = calendar.get(Calendar.MINUTE); // Получает текущую минуту
//
//        TimePickerDialog timePickerDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() { // Создает диалоговое окно выбора времени
//            @Override
//            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
//                @SuppressLint("DefaultLocale") String selectedTime = String.format("%02d:%02d", hourOfDay, minute); // Форматирует выбранное время
//                selectedTimeTextView.setText(selectedTime); // Устанавливает выбранное время в текстовое поле
//            }
//        }, hour, minute, true); // Устанавливает текущее время в качестве начального
//        timePickerDialog.show(); // Отображает диалоговое окно выбора времени
//    }
//}


