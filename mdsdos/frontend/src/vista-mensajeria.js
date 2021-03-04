import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-list-box/src/vaadin-list-box.js';
import '@vaadin/vaadin-item/src/vaadin-item.js';

class VistaMensajeria extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center;">
 <label>Mensajes de nombre del empleado</label>
 <vaadin-vertical-layout theme="spacing" style="width: 80%; margin-top: 2%;">
  <label style="border:solid">Mensajes recibidos</label>
  <vaadin-list-box style="width: 100%; border:solid; margin-top: 0;">
   <vaadin-item>
     Item one 
   </vaadin-item>
   <vaadin-item>
     Item two 
   </vaadin-item>
   <vaadin-item>
     Item three 
   </vaadin-item>
  </vaadin-list-box>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 80%; margin-top: 2%;">
  <vaadin-vertical-layout theme="spacing" style="width: 100%; align-items: flex-end;">
   <vaadin-button>
    Recibidos
   </vaadin-button>
   <vaadin-button>
    Enviados
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 100%;">
   <vaadin-button>
    Nuevo mensaje 
   </vaadin-button>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-mensajeria';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaMensajeria.is, VistaMensajeria);
