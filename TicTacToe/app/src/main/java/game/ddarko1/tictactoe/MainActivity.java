package game.ddarko1.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9;
    boolean turn;
    int player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);

        turn =true;
        player = 1;

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b1.getText().toString().equals("")) {
                    if (turn) {
                        turn =false;
                        player++;
                        b1.setText("X");
                    } else {
                        turn = true;
                        player++;
                        b1.setText("O");
                    }
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b2.getText().toString().equals("")) {
                    if (turn) {
                        turn =false;
                        player++;
                        b2.setText("X");
                    } else {
                        turn = true;
                        player++;
                        b2.setText("O");
                    }
                }
                endgame();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b3.getText().toString().equals("")) {
                    if (turn) {
                        turn =false;
                        player++;
                        b3.setText("X");
                    } else {
                        turn = true;
                        player++;
                        b3.setText("O");
                    }
                    endgame();
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b4.getText().toString().equals("")) {
                    if (turn) {
                        turn =false;
                        player++;
                        b4.setText("X");
                    } else {
                        turn = true;
                        player++;
                        b4.setText("O");
                    }
                    endgame();
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b5.getText().toString().equals("")) {
                    if (turn) {
                        turn =false;
                        player++;
                        b5.setText("X");
                    } else {
                        turn = true;
                        b5.setText("O");
                    }
                    endgame();
                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b6.getText().toString().equals("")) {
                    if (turn) {
                        turn =false;
                        player++;
                        b6.setText("X");
                    } else {
                        turn = true;
                        player++;
                        b6.setText("O");
                    }
                    endgame();
                }
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b7.getText().toString().equals("")) {
                    if (turn) {
                        turn =false;
                        player++;
                        b7.setText("X");
                    } else {
                        turn = true;
                        player++;
                        b7.setText("O");
                    }
                    endgame();
                }
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b8.getText().toString().equals("")) {
                    if (turn) {
                        turn =false;
                        player++;
                        b8.setText("X");
                    } else {
                        turn = true;
                        player++;
                        b8.setText("O");
                    }
                    endgame();
                }
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b9.getText().toString().equals("")) {
                    if (turn) {
                        turn =false;
                        b9.setText("X");
                    } else {
                        turn = true;
                        b9.setText("O");
                    }
                    endgame();
                }
            }
        });
    }

    public void endgame() {
        String one, two, three, four, five, six, seven, eight, nine;
        one = b1.getText().toString();
        two = b2.getText().toString();
        three = b3.getText().toString();
        four = b4.getText().toString();
        five = b5.getText().toString();
        six = b6.getText().toString();
        seven = b7.getText().toString();
        eight = b8.getText().toString();
        nine = b9.getText().toString();

        if (one.equals(two) && one.equals(three) && one.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner: Player 1", Toast.LENGTH_SHORT).show();
        }
        if (one.equals(five) && one.equals(nine) && one.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner: Player 1", Toast.LENGTH_SHORT).show();
        }
        if (one.equals(four) && one.equals(seven) && one.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner: Player 1", Toast.LENGTH_SHORT).show();
        }
        if (one.equals(two) && one.equals(three) && one.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner: Player 2", Toast.LENGTH_SHORT).show();
        }
        if (one.equals(five) && one.equals(nine) && one.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner: Player 2", Toast.LENGTH_SHORT).show();
        }
        if (one.equals(four) && one.equals(seven) && one.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner: Player 2", Toast.LENGTH_SHORT).show();
        }
        if (two.equals(one) && two.equals(three) && two.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner: Player 1", Toast.LENGTH_SHORT).show();
        }
        if (two.equals(five) && two.equals(eight) && two.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner: Player 1", Toast.LENGTH_SHORT).show();
        }
        if (two.equals(one) && two.equals(three) && two.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner: Player 2", Toast.LENGTH_SHORT).show();
        }
        if (two.equals(five) && two.equals(eight) && two.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner: Player 2", Toast.LENGTH_SHORT).show();
        }
        if (three.equals(two) && three.equals(one) && three.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner: Player 1", Toast.LENGTH_SHORT).show();
        }
        if (three.equals(five) && three.equals(seven) && three.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner: Player 1", Toast.LENGTH_SHORT).show();
        }
        if (three.equals(six) && three.equals(nine) && three.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner: Player 1", Toast.LENGTH_SHORT).show();
        }
        if (three.equals(two) && three.equals(one) && three.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner: Player 2", Toast.LENGTH_SHORT).show();
        }
        if (three.equals(five) && three.equals(seven) && three.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner: Player 2", Toast.LENGTH_SHORT).show();
        }
        if (three.equals(six) && three.equals(nine) && three.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner: Player 2", Toast.LENGTH_SHORT).show();
        }
        if (four.equals(one) && four.equals(seven) && four.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner: Player 1", Toast.LENGTH_SHORT).show();
        }
        if (four.equals(five) && four.equals(six) && four.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner: Player 1", Toast.LENGTH_SHORT).show();
        }
        if (four.equals(one) && four.equals(seven) && four.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner: Player 2", Toast.LENGTH_SHORT).show();
        }
        if (four.equals(five) && four.equals(six) && four.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner: Player 2", Toast.LENGTH_SHORT).show();
        }
        if (five.equals(one) && five.equals(nine) && five.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner: Player 1", Toast.LENGTH_SHORT).show();
        }
        if (five.equals(four) && five.equals(six) && five.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner: Player 1", Toast.LENGTH_SHORT).show();
        }
        if (five.equals(three) && five.equals(seven) && five.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner: Player 1", Toast.LENGTH_SHORT).show();
        }
        if (five.equals(two) && five.equals(eight) && five.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner: Player 1", Toast.LENGTH_SHORT).show();
        }
        if (five.equals(one) && five.equals(nine) && five.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner: Player 2", Toast.LENGTH_SHORT).show();
        }
        if (five.equals(four) && five.equals(six) && five.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner: Player 2", Toast.LENGTH_SHORT).show();
        }
        if (five.equals(three) && five.equals(seven) && five.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner: Player 2", Toast.LENGTH_SHORT).show();
        }
        if (five.equals(two) && five.equals(eight) && five.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner: Player 2", Toast.LENGTH_SHORT).show();
        }
        if (six.equals(three) && six.equals(nine) && six.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner: Player 1", Toast.LENGTH_SHORT).show();
        }
        if (six.equals(four) && six.equals(five) && six.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner: Player 1", Toast.LENGTH_SHORT).show();
        }
        if (six.equals(three) && six.equals(nine) && six.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner: Player 2", Toast.LENGTH_SHORT).show();
        }
        if (six.equals(four) && six.equals(five) && six.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner: Player 2", Toast.LENGTH_SHORT).show();
        }
        if (seven.equals(three) && seven.equals(five) && seven.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner: Player 1", Toast.LENGTH_SHORT).show();
        }
        if (seven.equals(one) && seven.equals(four) && seven.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner: Player 1", Toast.LENGTH_SHORT).show();
        }
        if (seven.equals(eight) && seven.equals(nine) && seven.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner: Player 1", Toast.LENGTH_SHORT).show();
        }
        if (seven.equals(three) && seven.equals(five) && seven.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner: Player 2", Toast.LENGTH_SHORT).show();
        }
        if (seven.equals(one) && seven.equals(four) && seven.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner: Player 2", Toast.LENGTH_SHORT).show();
        }
        if (seven.equals(eight) && seven.equals(nine) && seven.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner: Player 2", Toast.LENGTH_SHORT).show();
        }
        if (eight.equals(seven) && eight.equals(nine) && eight.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner: Player 1", Toast.LENGTH_SHORT).show();
        }
        if (eight.equals(two) && eight.equals(five) && eight.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner: Player 1", Toast.LENGTH_SHORT).show();
        }
        if (eight.equals(seven) && eight.equals(nine) && eight.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner: Player 2", Toast.LENGTH_SHORT).show();
        }
        if (eight.equals(two) && eight.equals(five) && eight.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner: Player 2", Toast.LENGTH_SHORT).show();
        }
        if (nine.equals(seven) && nine.equals(eight) && nine.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner: Player 1", Toast.LENGTH_SHORT).show();
        }
        if (nine.equals(one) && nine.equals(five) && nine.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner: Player 1", Toast.LENGTH_SHORT).show();
        }
        if (nine.equals(three) && nine.equals(six) && nine.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner: Player 1", Toast.LENGTH_SHORT).show();
        }
        if (nine.equals(seven) && nine.equals(eight) && nine.equals("OX")) {
            Toast.makeText(MainActivity.this, "Winner: Player 2", Toast.LENGTH_SHORT).show();
        }
        if (nine.equals(one) && nine.equals(five) && nine.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner: Player 2", Toast.LENGTH_SHORT).show();
        }
        if (nine.equals(three) && nine.equals(six) && nine.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner: Player 2", Toast.LENGTH_SHORT).show();
        }
    }

    public void newClick(View v) {
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
    }
}
