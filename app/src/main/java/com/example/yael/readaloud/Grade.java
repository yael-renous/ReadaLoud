package com.example.yael.readaloud;

public enum Grade {
    SECOND{
        @Override
        public String toString() {
            return "EASY";
        }

    }, FOURTH{
        @Override
        public String toString() {
            return "MEDIUM";
        }
    }, SIXTH{
        @Override
        public String toString() {
            return "HARD";
        }
    }
}
