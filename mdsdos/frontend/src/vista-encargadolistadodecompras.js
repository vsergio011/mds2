import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class VistaEncargadolistadodecompras extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%

                }
            </style>
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%;">
 <vaadin-vertical-layout theme="spacing-s" style="background-color:#232f3e; align-self: flex-start; align-items: center; padding: var(--lumo-space-s); margin: var(--lumo-space-xl); width: 20%; margin-right: 0;">
  <label style="color:white">Seleccionar compras por:</label>
  <vaadin-vertical-layout theme="spacing" style="flex-shrink: 1;">
   <vaadin-button id="btnNuevo" style="color:white; background-color:#374453; width: 100%;">
    Nuevos
   </vaadin-button>
   <vaadin-button id="btnEnviado" style="color:white; background-color:#374453; width: 100%;">
    Enviados
   </vaadin-button>
   <vaadin-button id="btnRecibido" style="color:white; background-color:#374453; width: 100%;">
    Entregados
   </vaadin-button>
   <vaadin-button id="btnAll" style="color:white; background-color:#374453; width: 100%;">
    Todos
   </vaadin-button>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 100%; margin: var(--lumo-space-xl); background-color:#f5f5f5; margin-left: 0; padding: var(--lumo-space-m);">
  <vaadin-horizontal-layout style="width: 100%;"></vaadin-horizontal-layout>
  <vaadin-vertical-layout theme="spacing" id="contenedorPedidos" style="width: 100%; height: 100%;"></vaadin-vertical-layout>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'vista-encargadolistadodecompras';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaEncargadolistadodecompras.is, VistaEncargadolistadodecompras);
