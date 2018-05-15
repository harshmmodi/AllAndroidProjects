package com.example.harshmodi.tic_tac_toe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText e1, e2, e3, e4, e5,e6,e7,e8,e9;
    private Button b1, b2, b3, b4, b5, b6, b7,b8, b9, rst, result;
    private Button l1, l2, l3, l4, l5, l6, l7, l8;
    int chance = 1;
    int ar[];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ar = new int[9];
        for(int i = 0; i < 9; i++)ar[i] = 0;
        e1 = (EditText)findViewById(R.id.ed1);
        e2 = (EditText)findViewById(R.id.ed2);
        e3 = (EditText)findViewById(R.id.ed3);
        e4 = (EditText)findViewById(R.id.ed4);
        e5 = (EditText)findViewById(R.id.ed5);
        e6 = (EditText)findViewById(R.id.ed6);
        e7 = (EditText)findViewById(R.id.ed7);
        e8 = (EditText)findViewById(R.id.ed8);
        e9 = (EditText)findViewById(R.id.ed9);

        b1 = (Button)findViewById(R.id.button1);
        b2 = (Button)findViewById(R.id.button2);
        b3 = (Button)findViewById(R.id.button3);
        b4 = (Button)findViewById(R.id.button4);
        b5 = (Button)findViewById(R.id.button5);
        b6 = (Button)findViewById(R.id.button6);
        b7 = (Button)findViewById(R.id.button7);
        b8 = (Button)findViewById(R.id.button8);
        b9 = (Button)findViewById(R.id.button9);
        rst = (Button)findViewById(R.id.Reset);
        result = (Button)findViewById(R.id.result) ;

        l1 = (Button)findViewById(R.id.button012);
        l2 = (Button)findViewById(R.id.button345);
        l3 = (Button)findViewById(R.id.button678);
        l4 = (Button)findViewById(R.id.button036);
        l5 = (Button)findViewById(R.id.button147);
        l6 = (Button)findViewById(R.id.button258);
        l7 = (Button)findViewById(R.id.button048);
        l8 = (Button)findViewById(R.id.button246);


        l1.setVisibility(View.INVISIBLE);
        l2.setVisibility(View.INVISIBLE);
        l3.setVisibility(View.INVISIBLE);
        l4.setVisibility(View.INVISIBLE);
        l5.setVisibility(View.INVISIBLE);
        l6.setVisibility(View.INVISIBLE);
        l7.setVisibility(View.INVISIBLE);
        l8.setVisibility(View.INVISIBLE);

        e1.setFocusable(false);
        e2.setFocusable(false);
        e3.setFocusable(false);
        e4.setFocusable(false);
        e5.setFocusable(false);
        e6.setFocusable(false);
        e7.setFocusable(false);
        e8.setFocusable(false);
        e9.setFocusable(false);

        rst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chance = 1;
                e1.setText(null);
                e2.setText(null);
                e3.setText(null);
                e4.setText(null);
                e5.setText(null);
                e6.setText(null);
                e7.setText(null);
                e8.setText(null);
                e9.setText(null);
                for(int i = 0; i < 9; i++) ar[i] = 0;

                l1.setVisibility(View.INVISIBLE);
                l2.setVisibility(View.INVISIBLE);
                l3.setVisibility(View.INVISIBLE);
                l4.setVisibility(View.INVISIBLE);
                l5.setVisibility(View.INVISIBLE);
                l6.setVisibility(View.INVISIBLE);
                l7.setVisibility(View.INVISIBLE);
                l8.setVisibility(View.INVISIBLE);
                result.setText(null);
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tmp = e1.getText().toString();
                if(tmp.length() == 0) {
                    if (chance % 2 == 1) {
                        e1.setText("  X");
                        ar[0] = 1;
                    } else {e1.setText("  O"); ar[0] = 10;}
                    chance++;
                    if (ar[0] + ar[1] + ar[2] == 3 || ar[0] + ar[1] + ar[2] == 30) {
                        l1.setVisibility(View.VISIBLE);
                        if (chance % 2 == 0) {
                            result.setText("Player 1 Wins!");
                        } else result.setText("Player 2 Wins!");
                    }
                    else if (ar[0] + ar[3] + ar[6] == 3 || ar[0] + ar[3] + ar[6] == 30) {
                        l4.setVisibility(View.VISIBLE);
                        if (chance % 2 == 0) {
                            result.setText("Player 1 Wins!");
                        } else result.setText("Player 2 Wins!");
                    }
                    else if (ar[0] + ar[4] + ar[8] == 3 || ar[0] + ar[4] + ar[8] == 30) {
                        l7.setVisibility(View.VISIBLE);
                        if (chance % 2 == 0) {
                            result.setText("Player 1 Wins!");
                        } else result.setText("Player 2 Wins!");
                    }
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tmp = e2.getText().toString();
                if(tmp.length() == 0) {
                    if (chance % 2 == 1) {
                        e2.setText("  X"); ar[1] = 1;
                    } else {e2.setText("  O"); ar[1] = 10;}
                    chance++;
                    if (ar[0] + ar[1] + ar[2] == 3 || ar[0] + ar[1] + ar[2] == 30) {
                        l1.setVisibility(View.VISIBLE);
                        if (chance % 2 == 0) {
                            result.setText("Player 1 Wins!");
                        } else result.setText("Player 2 Wins!");
                    }
                    else if (ar[1] + ar[4] + ar[7] == 3 || ar[1] + ar[4] + ar[7] == 30) {
                        l5.setVisibility(View.VISIBLE);
                        if (chance % 2 == 0) {
                            result.setText("Player 1 Wins!");
                        } else result.setText("Player 2 Wins!");
                    }

                }
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tmp = e3.getText().toString();
                if(tmp.length() == 0) {
                    if (chance % 2 == 1) {
                        e3.setText("  X"); ar[2] = 1;
                    } else{ e3.setText("  O"); ar[2] = 10;}
                    chance++;
                    if (ar[0] + ar[1] + ar[2] == 3 || ar[0] + ar[1] + ar[2] == 30) {
                        l1.setVisibility(View.VISIBLE);
                        if (chance % 2 == 0) {
                            result.setText("Player 1 Wins!");
                        } else result.setText("Player 2 Wins!");
                    }
                    else if (ar[2] + ar[5] + ar[8] == 3 || ar[2] + ar[5] + ar[8] == 30) {
                        l6.setVisibility(View.VISIBLE);
                        if (chance % 2 == 0) {
                            result.setText("Player 1 Wins!");
                        } else result.setText("Player 2 Wins!");
                    }
                    else if (ar[2] + ar[4] + ar[6] == 3 || ar[2] + ar[4] + ar[6] == 30) {
                        l8.setVisibility(View.VISIBLE);
                        if (chance % 2 == 0) {
                            result.setText("Player 1 Wins!");
                        } else result.setText("Player 2 Wins!");
                    }
                }
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tmp = e4.getText().toString();
                if(tmp.length() == 0) {
                    if (chance % 2 == 1) {
                        e4.setText("  X"); ar[3] = 1;
                    } else {e4.setText("  O"); ar[3] = 10;}
                    chance++;
                   if (ar[3] + ar[4] + ar[5] == 3 || ar[3] + ar[4] + ar[5] == 30) {
                        l2.setVisibility(View.VISIBLE);
                        if (chance % 2 == 0) {
                            result.setText("Player 1 Wins!");
                        } else result.setText("Player 2 Wins!");
                    }
                    else if (ar[0] + ar[3] + ar[6] == 3 || ar[0] + ar[3] + ar[6] == 30) {
                        l4.setVisibility(View.VISIBLE);
                        if (chance % 2 == 0) {
                            result.setText("Player 1 Wins!");
                        } else result.setText("Player 2 Wins!");
                    }

                }
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tmp = e5.getText().toString();
                if(tmp.length() == 0) {
                    if (chance % 2 == 1) {
                        e5.setText("  X"); ar[4] = 1;
                    } else {e5.setText("  O"); ar[4] = 10;}
                    chance++;
                    if (ar[3] + ar[4] + ar[5] == 3 || ar[3] + ar[4] + ar[5] == 30) {
                        l2.setVisibility(View.VISIBLE);
                        if (chance % 2 == 0) {
                            result.setText("Player 1 Wins!");
                        } else result.setText("Player 2 Wins!");
                    }
                    else if (ar[1] + ar[4] + ar[7] == 3 || ar[1] + ar[4] + ar[7] == 30) {
                        l5.setVisibility(View.VISIBLE);
                        if (chance % 2 == 0) {
                            result.setText("Player 1 Wins!");
                        } else result.setText("Player 2 Wins!");
                    }
                    else if (ar[0] + ar[4] + ar[8] == 3 || ar[0] + ar[4] + ar[8] == 30) {
                        l7.setVisibility(View.VISIBLE);
                        if (chance % 2 == 0) {
                            result.setText("Player 1 Wins!");
                        } else result.setText("Player 2 Wins!");
                    }
                    else if (ar[2] + ar[4] + ar[6] == 3 || ar[2] + ar[4] + ar[6] == 30) {
                        l8.setVisibility(View.VISIBLE);
                        if (chance % 2 == 0) {
                            result.setText("Player 1 Wins!");
                        } else result.setText("Player 2 Wins!");
                    }
                }
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tmp = e6.getText().toString();
                if(tmp.length() == 0) {
                    if (chance % 2 == 1) {
                        e6.setText("  X"); ar[5] = 1;
                    } else {e6.setText("  O"); ar[5] = 10;}
                    chance++;
                    if (ar[2] + ar[5] + ar[8] == 3 || ar[2] + ar[5] + ar[8] == 30)  {
                        l6.setVisibility(View.VISIBLE);
                        if (chance % 2 == 0) {
                            result.setText("Player 1 Wins!");
                        } else result.setText("Player 2 Wins!");
                    }
                    else if (ar[3] + ar[4] + ar[5] == 3 || ar[3] + ar[4] + ar[5] == 30) {
                        l2.setVisibility(View.VISIBLE);
                        if (chance % 2 == 0) {
                            result.setText("Player 1 Wins!");
                        } else result.setText("Player 2 Wins!");
                    }

                }
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tmp = e7.getText().toString();
                if(tmp.length() == 0) {
                    if (chance % 2 == 1) {
                        e7.setText("  X"); ar[6] = 1;
                    } else {e7.setText("  O"); ar[6]  = 10;}
                    chance++;
                    if (ar[6] + ar[7] + ar[8] == 3 || ar[6] + ar[7] + ar[8] == 30 ) {
                        l3.setVisibility(View.VISIBLE);
                        if (chance % 2 ==0) {
                            result.setText("Player 1 Wins!");
                        } else result.setText("Player 2 Wins!");
                    }
                    else if (ar[0] + ar[3] + ar[6] == 3 || ar[0] + ar[3] + ar[6] == 30) {
                        l4.setVisibility(View.VISIBLE);
                        if (chance % 2 == 0) {
                            result.setText("Player 1 Wins!");
                        } else result.setText("Player 2 Wins!");
                    }
                    else if (ar[2] + ar[4] + ar[6] == 3 || ar[2] + ar[4] + ar[6] == 30) {
                        l8.setVisibility(View.VISIBLE);
                        if (chance % 2 == 0) {
                            result.setText("Player 1 Wins!");
                        } else result.setText("Player 2 Wins!");
                    }
                }
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tmp = e8.getText().toString();
                if(tmp.length() == 0) {
                    if (chance % 2 == 1) {
                        e8.setText("  X"); ar[7] = 1;
                    } else {e8.setText("  O"); ar[7]= 10;}
                    chance++;
                    if (ar[6] + ar[7] + ar[8] == 3 || ar[6] + ar[7] + ar[8] == 30) {
                        l3.setVisibility(View.VISIBLE);
                        if (chance % 2 == 0) {
                            result.setText("Player 1 Wins!");
                        } else result.setText("Player 2 Wins!");
                    }
                    else if (ar[1] + ar[4] + ar[7] == 3 || ar[1] + ar[4] + ar[7] == 30) {
                        l5.setVisibility(View.VISIBLE);
                        if (chance % 2 == 0) {
                            result.setText("Player 1 Wins!");
                        } else result.setText("Player 2 Wins!");
                    }

                }
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tmp = e9.getText().toString();
                if(tmp.length() == 0) {
                    if (chance % 2 == 1) {
                        e9.setText("  X"); ar[8] = 1;
                    } else {e9.setText("  O"); ar[8] = 10;}
                    chance++;
                    if (ar[6] + ar[7] + ar[8] == 3 || (ar[6] + ar[7] + ar[8] == 30)) {
                        l3.setVisibility(View.VISIBLE);
                        if (chance % 2 == 0) {
                            result.setText("Player 1 Wins!");
                        } else result.setText("Player 2 Wins!");
                    }
                    else if (ar[2] + ar[5] + ar[8] == 3 || ar[2] + ar[5] + ar[8] == 30) {
                        l6.setVisibility(View.VISIBLE);
                        if (chance % 2 == 0) {
                            result.setText("Player 1 Wins!");
                        } else result.setText("Player 2 Wins!");
                    }
                    else if (ar[0] + ar[4] + ar[8] == 3 || ar[0] + ar[4] + ar[8] == 30) {
                        l7.setVisibility(View.VISIBLE);
                        if (chance % 2 == 0) {
                            result.setText("Player 1 Wins!");
                        } else result.setText("Player 2 Wins!");
                    }
                }
            }
        });








    }
}
