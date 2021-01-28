package fr.archemod.gui;

import fr.archemod.chat.capabilities.indicator.ArcheChatStorage;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.GuiChat;

import java.io.IOException;

public class GuiChatArche extends GuiChat {

    public GuiChatArche(){
    }

    public GuiChatArche(String defaultText) {
        super(defaultText);
    }

    @Override
    public void onGuiClosed()
    {
        super.onGuiClosed();
        EntityPlayerSP entityPlayerSP = (Minecraft.getMinecraft()).player;
        if(entityPlayerSP.hasCapability(ArcheChatStorage.I_ARCHE_CHAT_CAPABILITY,null)){
            entityPlayerSP.getCapability(ArcheChatStorage.I_ARCHE_CHAT_CAPABILITY,null).setIndicator(0);
            entityPlayerSP.getCapability(ArcheChatStorage.I_ARCHE_CHAT_CAPABILITY,null).sync(entityPlayerSP);
        }
    }

    @Override
    protected void keyTyped(char typedChar, int keyCode) throws IOException {
        super.keyTyped(typedChar,keyCode);
        if(this.inputField.getText().length() >= 1 && keyCode!=1 && keyCode!=28 && keyCode!=156){
            sendIndicatorToServer(this.inputField.getText().charAt(0));
        } else if (this.inputField.getText().length()==0 || keyCode==1 || keyCode==28 || keyCode==156){
            EntityPlayerSP entityPlayerSP = (Minecraft.getMinecraft()).player;
            if(entityPlayerSP.hasCapability(ArcheChatStorage.I_ARCHE_CHAT_CAPABILITY,null)){
                entityPlayerSP.getCapability(ArcheChatStorage.I_ARCHE_CHAT_CAPABILITY,null).setIndicator(0);
                entityPlayerSP.getCapability(ArcheChatStorage.I_ARCHE_CHAT_CAPABILITY,null).sync(entityPlayerSP);
            }
        }
    }

    private void sendIndicatorToServer(char firstChar){
        EntityPlayerSP entityPlayerSP = (Minecraft.getMinecraft()).player;
        if(entityPlayerSP!=null && entityPlayerSP.hasCapability(ArcheChatStorage.I_ARCHE_CHAT_CAPABILITY,null)){
            switch (firstChar){
                case '*' :
                    entityPlayerSP.getCapability(ArcheChatStorage.I_ARCHE_CHAT_CAPABILITY,null).setIndicator(2);
                    break;
                case '(':
                    entityPlayerSP.getCapability(ArcheChatStorage.I_ARCHE_CHAT_CAPABILITY,null).setIndicator(3);
                    break;
                default:
                    entityPlayerSP.getCapability(ArcheChatStorage.I_ARCHE_CHAT_CAPABILITY,null).setIndicator(1);
                    break;
            }
            entityPlayerSP.getCapability(ArcheChatStorage.I_ARCHE_CHAT_CAPABILITY,null).sync(entityPlayerSP);
        }
    }

}
