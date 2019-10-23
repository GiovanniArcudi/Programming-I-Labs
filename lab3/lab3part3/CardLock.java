/**
 * This program defines a CardLock. Every CardLock has an instance variable to remember the last smart card seen.
 * A CardLock can be staff only, or it can allow access to both students and staff.
 * A newly created CardLock allows only staff access.
 *
 * @author Giovanni Arcudi
 */

public class CardLock{
    SmartCard lastCardSeen;
    boolean lockUnlocked;
    boolean studentsAllowed;

    /**
     * When the method swipeCard(Smartcard swiped) is called, it sets the SmartCard it has received as parameter
     * to be the last card seen.
     */
    public void swipeCard(SmartCard swiped){
        lastCardSeen = swiped;
    }

    /**
     * When the method getLastCardSeen() is called, it returns the last smart card that was swiped.
     */
    public SmartCard getLastCardSeen(){
        return lastCardSeen;
    }

    /**
     * When the method isUnlocked() is called, it returns a boolean indicating whether the lock is unlocked or not.
     * The door keeps locked only if the last card seen is astudent card and student access is not allowed.
     */
    public boolean isUnlocked(){
        if(lastCardSeen.isStaff() || studentsAllowed) {
            lockUnlocked = true;
        }
        else{
            lockUnlocked = false;
        }
        return lockUnlocked;
    }

    /** The toggleStudentAccess() method acts like a push switch or power button, toggling whether students are
     * allowed to unlock the CardLock. */
    public void toggleStudentAccess(){
        studentsAllowed = !studentsAllowed;
    }
}