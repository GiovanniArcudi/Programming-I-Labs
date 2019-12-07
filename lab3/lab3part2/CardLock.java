/**
 * Every {@link CardLock} has an instance variable to remember the last {@link SmartCard} seen.
 * A CardLock can be staff only, or it can allow access to both students and staff.
 * A newly created CardLock allows only staff access.
 *
 * @author Giovanni Arcudi
 * @version 1.0
 */
public class CardLock {
    SmartCard lastCardSeen;         // The last SmartCard seen.
    boolean lockUnlocked;           // True if the door is unlocked, false otherwise.
    boolean studentsAllowed;        // True if students are allowed, false otherwise.

    /**
     * Sets the {@link SmartCard} it has received as parameter to be the {@code lastCardSeen}.
     */
    public void swipeCard(SmartCard swiped) {
        lastCardSeen = swiped;
    }

    /**
     * Returns the last {@link SmartCard} that was swiped.
     *
     * @return the last SmartCard seen
     */
    public SmartCard getLastCardSeen() {
        return lastCardSeen;
    }

    /**
     * Returns a boolean indicating whether the lock is unlocked or not.
     * The door keeps locked only if the last card seen is astudent card and student access is not allowed.
     *
     * @return true if the door is unlocked, false otherwise
     */
    public boolean isUnlocked() {
        if(lastCardSeen.isStaff() || studentsAllowed) {
            lockUnlocked = true;
        } else {
            lockUnlocked = false;
        }
        return lockUnlocked;
    }

    /** 
     * This method acts like a push switch or power button, toggling whether students are allowed to unlock the {@link CardLock}. 
     */
    public void toggleStudentAccess(){
        studentsAllowed = !studentsAllowed;
    }
}
