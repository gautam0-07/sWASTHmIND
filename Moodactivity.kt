    private fun saveMood(mood: String) {
        val database = FirebaseDatabase.getInstance()
        val moodRef = database.getReference("moods")

        val moodId = moodRef.push().key

        if (moodId != null) {
            moodRef.child(moodId).setValue(mood)
                .addOnSuccessListener {
                    android.util.Log.d("FIREBASE_OK", "Saved mood: $mood")
                }
                .addOnFailureListener { e ->
                    android.util.Log.e("FIREBASE_FAIL", "Error saving mood", e)
                }
        } else {
            android.util.Log.e("FIREBASE_FAIL", "moodId is null")
        }
    }
    private fun openSuggestion(mood: String) {
        val intent = Intent(this, SuggestionActivity::class.java)
        intent.putExtra("selectedMood", mood)
        startActivity(intent)
    }
}
